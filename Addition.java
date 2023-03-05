public class Addition {
    public static void main(String[] args) throws Exception{
    ReadInput readF = new ReadInput();
    readF.inputReader();
    Colculation ts = new Colculation();

    ts.computing(readF.numA(),readF.numB());
    
}
}
