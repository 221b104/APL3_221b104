class Voice {
    public void templateMethod() {
        prepareVoice();
        hear();
    }
    protected void prepareVoice() {
        System.out.println("Preparing the voice...");
    }
    protected void hear() {
        System.out.println("Hearing the voice...");
    }
}
