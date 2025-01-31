class Voice2 extends Voice {

    @Override
    protected void prepareVoice() {
        System.out.println("Voice2: Preparing the animal voice...");
    }

    @Override
    protected void hear() {
        System.out.println("Voice2: Hearing the animal's sound...");
    }
}
