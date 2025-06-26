class ss{
    int a;
    int b;
    public int yoo (int a,int b){
        return a+b;
    }

    public void yo1(int a,int b){
        if (a>b){
            System.out.println("lavde ke baal");
            for (int i=1;i<10;i++){
                System.out.println("yes adhiraj keep on going");
            }

        } else if (b<a) {
            System.out.println("bsdek ke bethe");

        }
    }

    public static void main(String[] args) {
        ss y1=new ss();
        y1.yo1(100,20);
    }



}

