public class TestMovable {
    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(0,0,5,5);
        //System.out.println(topLeft1);
        MovablePoint bottomRight = new MovablePoint(10,10,5,5);
        //System.out.println(bottomRight1);
        MovableRectangle r1 = new MovableRectangle(10,10,5,5,topLeft,bottomRight);
        System.out.println(r1);
        r1.toString();
        topLeft.moveRight();
        bottomRight.moveRight();
        topLeft.moveRight();
        bottomRight.moveRight();
        bottomRight.moveRight();
        bottomRight.moveRight();
        bottomRight.moveRight();
        bottomRight.moveRight();
        bottomRight.moveRight();




        System.out.println(r1);
        /*System.out.println(
                "bottomRight.x="+bottomRight.x+'\n'+
                        "bottomRight.y="+bottomRight.y+'\n'+
                        "topLeft.x="+topLeft.x+'\n'+
                        "topLeft.y="+topLeft.y+'\n'+
                        "x="+r1.x+'\n'+
                        "y="+r1.y+'\n'
        );*/
        System.out.println(r1.checkSpeed());
        r1.toString();





    }
}
