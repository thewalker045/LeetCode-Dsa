class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        boolean break1 = false;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                    if(list1[i].equals(list2[j])){
                        if(min==i+j)
                            list.add(list1[i]);
                        else if(min>i+j){
                            list.clear();
                            list.add(list1[i]);
                            min=i+j;
                        }
                        else System.out.println("continued");
                        
                    }
            }

        }

        System.out.println(list);
        return list.toArray(new String[0]);
        
    }
}