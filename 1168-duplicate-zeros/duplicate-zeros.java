class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> list=new ArrayList<>();
        

        for(int num:arr){
            if(num==0){
                list.add(0);
                list.add(0);
            }
            else{
                list.add(num);
            }
        }
        System.out.println(list);
        int i=0;
        for(int num:list){
                arr[i]=num;
                if(i==arr.length-1)break;
                i++;
        }
       
    }
}