class Child extends Mother {
    // constructor for child (optional, added for clarity)
    public Child() {
        // call mother's constructor
        super();
        System.out.println("Child constructor called");
    }

    // child inherits the show() method from Mother
}