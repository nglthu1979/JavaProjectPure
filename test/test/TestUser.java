public class TestUser {

    public void test(){
        User u1 = new User("gfz", "Nguyen Thi Van");
        User u2 = new User("123", "Tran Van Minh");

        ListUser lu = new ListUser();
        lu.addUser(u2);
        lu.addUser(u1);
    }
    

    
}
