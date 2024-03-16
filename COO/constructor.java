class Data {
    int dia;
    int mes;
    int ano;

    public Data() { // This is a constructor. It will set values automatically when an object is
                    // created.
        ano = 2024;
    }

    public static void main(String[] args) {
        Data dataDeHoje = new Data();
        dataDeHoje.dia = 15;
        dataDeHoje.mes = 03;
        System.out.println(dataDeHoje.dia + "/" + dataDeHoje.mes + "/" + dataDeHoje.ano);
    }
}
