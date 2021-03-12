package Compe_D;

import java.util.*;

class Anagram_count {
    public static void main(String args[] ) throws Exception {
            Scanner in=new Scanner(System.in);
            int count=0;
            int T=in.nextInt();
            while(T>0)
            {
                int ar1[]=new int[26];
                int ar2[]=new int[26];
                String a=in.next();
                String b=in.next();
                a=a.toLowerCase();
                b=b.toLowerCase();
                for(int i=0;i<a.length();i++)
                {
                    int ch=a.charAt(i)-'a';
                    ar1[ch]++;
                }
                for(int i=0;i<b.length();i++)
                {
                    int ch=b.charAt(i)-'a';
                    ar2[ch]++;
                }
                for(int i=0;i<ar1.length;i++)
                {
                    
                    if(ar1[i]>0 && ar2[i]>0)
                    {
                        if(ar1[i]!=ar2[i]){
                        int p=(ar1[i]>ar2[i]?ar1[i]-ar2[i]:ar2[i]-ar1[i]);
                        count+=p;
                        }

                    }
                    else if(ar1[i]>0 || ar2[i]>0 ){
                        if(ar1[i]!=ar2[i]){
                        int p=Math.max(ar1[i],ar2[i]);
                        count+=p;
                        }
                    }

                }
                System.out.println(count);
                count=0;
                T--;
                for(int i:ar1)
                	System.out.print(i+" ");
                System.out.println();
                for(int i:ar2)
                	System.out.print(i+" ");
                System.out.println();
              
            }
            in.close();
        }
    }
        