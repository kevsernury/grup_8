package _grup_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class _Grup_8_Parse {
    
    public void fileReader(String fileName)
    {
        String filename=fileName;
        
        File textFile;
        textFile = new File(filename);
        Scanner in;
        String kod = "1";
        //ArrayList<_Grup_8_Assembly> assembly = new ArrayList<_Grup_8_Assembly>();
        ArrayList<_Grup_8_Bellek_AB> bellek_AB = new ArrayList<_Grup_8_Bellek_AB>();
        ArrayList<_Grup_8_Yazac_AB> yazac_AB = new ArrayList<_Grup_8_Yazac_AB>();
        String [] line;
        String [] bellekAdreslemeliBuyruk = {"AND","ADD","LDA","STA","BUN","BSA","ISZ"};
        String [] yazacAdreslemeliBuyruk = {"CLA","CLE","CMA","CME","CIL","INC","SPA","SNA","SZA","SZE","HLT"};  
        String [] girisCikisBuyrukları = {"INP","OUT","SKI","SKO","ION","IOF",};
        ArrayList<String> aciklama = new ArrayList<String>();
        _Grup_8_Bellek_AB _grup_8_Assembly = new _Grup_8_Bellek_AB();
        boolean kontrol_bellekAB=false;
        boolean kontrol_yazacAB=false;
        boolean kontrol_girisCikisAB=false;
        try{
            in = new Scanner(textFile);
            //kod = in.nextLine();
            //line= kod.split(" ");
            //_Grup_8_Assembly lines = new _Grup_8_Assembly(kod, kod, filename, kod, kod);
            //System.out.println(line[0]);
            int n=0;
            while(in.hasNextLine())
            {
                
                n++;
                if(kod == null)
                {
                    break;
                }
                kod = in.nextLine();
                line= kod.split(" ");
                //int l = line.length;
                //l--;
                
                
                for(int i=0;i<line.length;i++)
                {
                    String kelime = line[i];
                    
                    if(kelime.charAt(0) == '/')
                    {
                        aciklama.add(n+"");
                        //aciklama[i].add(n+"_");
                        for(int j=i;j<line.length;j++)
                        {
                            aciklama.add(line[j]);
                            //System.out.print("1");
                        }
                        //aciklama.add(geciciAciklama);
                        
                    }
                }
                
                
                
            }
        }catch(FileNotFoundException e){
            
        }
        try{
            in = new Scanner(textFile);
            //kod = in.nextLine();
            //line= kod.split(" ");
            //_Grup_8_Assembly lines = new _Grup_8_Assembly(kod, kod, filename, kod, kod);
            //System.out.println(line[0]);
            int n=0;
            while(in.hasNextLine())
            {
                kontrol_bellekAB=false;
                kontrol_yazacAB=false;
                kontrol_girisCikisAB=false;
                n++;
                //System.out.println(in.next());
                if(kod==null)
                {
                    break;
                }
                kod = in.nextLine();
                line = kod.split(" ");
                for(int c=0;c<line.length;c++)
                {
                    if(line[c].charAt(0) == '/')
                    {
                        //Yorum satırı atla
                        break;
                    }
                    else
                    {
                        if(line[c].charAt(line[c].length()-1) == ',')
                        {
                            //Label var
                            //System.out.println(line[c]);
                            for(int i=0;i<bellekAdreslemeliBuyruk.length;i++)
                            {
                                if(line[c+1].equals(bellekAdreslemeliBuyruk[i]) == true)
                                {
                                    //Bellek adreslemeli buyruk
                                    kontrol_bellekAB=true;
                                    //Kayıt yap
                                    if(line[c+3].charAt(0) == 'I')
                                    {
                                        //I biti var
                                        bellek_AB.add(new _Grup_8_Bellek_AB(n, line[c], line[c+1], line[c+2], true));
                                    }
                                    else
                                    {
                                        //I biti yok
                                        bellek_AB.add(new _Grup_8_Bellek_AB(n, line[c], line[c+1], line[c+2], false));
                                    }
                                    
                                }
                                   
                            }
                            for(int i=0;i<yazacAdreslemeliBuyruk.length;i++)
                            {
                                if(line[c+1].equals(yazacAdreslemeliBuyruk[i]) == true)
                                {
                                    //yazac adreslemeli buyruk
                                    kontrol_yazacAB=true;
                                    //Kayıt yap
                                    yazac_AB.add(new _Grup_8_Yazac_AB(n, line[c], line[c+1]));
                                }    
                            }
                            for(int i=0;i<girisCikisBuyrukları.length;i++)
                            {
                                if(line[c+1].equals(girisCikisBuyrukları[i]) == true)
                                {
                                    //giriş çıkış buyrukları
                                    kontrol_girisCikisAB=true;
                                    //Kayıt yap YAPILACAK YAPILMADI
                                }    
                            }
                            if(kontrol_bellekAB == false && kontrol_yazacAB == false && kontrol_girisCikisAB == false)
                            {
                                //Pseudo kod YAPILACAK YAPILMADI
                            }
                            
                        }
                        else
                        {
                            //Label yok
                            
                            for(int i=0;i<bellekAdreslemeliBuyruk.length;i++)
                            {
                                //System.out.println(line[c] +"=="+bellekAdreslemeliBuyruk[i]);
                                
                                if(line[c].equals(bellekAdreslemeliBuyruk[i]) == true)
                                {
                                    
                                    //Bellek adreslemeli buyruk
                                    kontrol_bellekAB=true;
                                    //Kayıt yap
                                    if(line[c+2].charAt(0) == 'I')
                                    {
                                        //I biti var
                                        bellek_AB.add(new _Grup_8_Bellek_AB(n, " ", line[c], line[c+1], true));
                                    }
                                    else
                                    {
                                        //I biti yok
                                        bellek_AB.add(new _Grup_8_Bellek_AB(n, " ", line[c], line[c+1], false));
                                    }
                                }
                                   
                            }
                            for(int i=0;i<yazacAdreslemeliBuyruk.length;i++)
                            {
                                //System.out.println(line[c] +" "+yazacAdreslemeliBuyruk[i]);
                                //System.out.println(line[c].equals(yazacAdreslemeliBuyruk[i]));
                                if(line[c].equals(yazacAdreslemeliBuyruk[i]) == true)
                                {
                                    //yazac adreslemeli buyruk
                                    kontrol_yazacAB=true;
                                    //Kayıt yap
                                    yazac_AB.add(new _Grup_8_Yazac_AB(n, " ", line[c]));
                                }    
                            }
                            for(int i=0;i<girisCikisBuyrukları.length;i++)
                            {
                                if(line[c].equals(girisCikisBuyrukları[i]) == true)
                                {
                                    //giriş çıkış buyrukları
                                    kontrol_girisCikisAB=true;
                                    //Kayıt yap YAPILACAK YAPILMADI
                                }    
                            }
                            if(kontrol_bellekAB == false && kontrol_yazacAB == false && kontrol_girisCikisAB == false)
                            {
                                //Pseudo kod YAPILACAK YAPILMADI
                            }
                        }
                    }
                        
                    
                }
                
            }
        }catch(FileNotFoundException e){
            
        }

        for(int n=0;n<bellek_AB.size();n++)
        {
            for(int i=0;i<aciklama.size();i++)
            {
                
                System.out.println("--"+bellek_AB.get(n).line+"=="+aciklama.get(i).charAt(0)+"--");
                //ArrayList<String> aa = new ArrayList<String>();
                //aa = aciklama.get(i);
                char a = (char)bellek_AB.get(n).line;
                String a1 = String.valueOf(a);
                char b = aciklama.get(i).charAt(0);
                String b1 = String.valueOf(b);
                //System.out.println(a1.equals(b1));
                //System.out.println("4".equals("4"));
                if(a1.equals(b1) == true)
                {
                    System.out.println("kontrol");
                    //System.out.println(aciklama.get(i));
                    //System.out.println(bellek_AB.get(n).line+""+aa.get(i).charAt(0));
                    bellek_AB.get(n).setComment(aciklama);
                }
            }
            bellek_AB.get(n).goster();
            
        }
        System.out.println(aciklama);
        for(int n=0;n<yazac_AB.size();n++)
        {
            
            yazac_AB.get(n).goster();
        }
        
    }

}
