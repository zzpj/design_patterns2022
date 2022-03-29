package pl.p.lodz.zzpj.chain;

public class Example {

    public Example() {

        IChainHandler h1 = new Authenticate();
        IChainHandler h2 = new Authorize();
        IChainHandler h3 = new Validate();

        h1.setNext(h2);
        h2.setNext(h3);

        User user1 = new User("test", "test", true, "test");
        User user2 = new User("test", "test", true, "");

        h1.handle(user1);
        h1.handle(user2);
    }
}
