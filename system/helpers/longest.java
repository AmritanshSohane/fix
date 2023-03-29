/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package longest;
import java.util.*;
import java.math.*;

/**
 *
 * @author mcr
 */
public class longest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list=new ArrayList<>();
        int[] ar={1,1,1,3,3,2,2};
        for(int i:ar){
            list.add(i);
        }
        int res=longsub(list);
        System.out.println(res);
        //System.out.println(Math.abs(-2+1));
    }

    private static int longsub(List<Integer> list) {
        int ans=1,k=1;
        while(k<list.size()){
          //  ArrayList arr=new ArrayList<>();
            int s=0;
            for(int i=k;i<list.size();i++){
                if((Math.abs(list.get(i)-list.get(i-1)))<2){
                    k++;
                    s++;
                    if(ans<s){
                        ans=s;
                    }
                }else{
                    k++;
                    break;
                }
            }
        }
        return ans;
    }
    
}
