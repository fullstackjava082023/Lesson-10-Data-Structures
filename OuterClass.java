class OuterClass {
    int x = 10;
//    InnerClass innerClass = new InnerClass();


    static class InnerClass {
       int y = 5;

    }

    public InnerClass getInnerClass() {
        return new InnerClass();
    }

    public int getInnerY() {
//        return getInnerClass().y;
        return  5;
    }





}
