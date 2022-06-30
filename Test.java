class HelloWorld {
    public static void main(String[] args) {
       List<Integer> i=new ArrayList();
        i.add(new Integer(15000));
        i.add(new Integer(4500));
        i.add(new Integer(7500));
        i.add(new Integer(1700));
        i.add(new Integer(20000));
        i.add(new Integer(5500));
        Collections.sort(i,Comparator.reverseOrder());
        //Last third salary
        i.forEach((j)->{
            
        System.out.println(j);
        });; 
    }
}