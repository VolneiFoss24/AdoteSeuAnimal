import java.util.Scanner;

public class AdoteSeuAnimalApp {

    // metodo de entrada para o usuario responder se quer adotar ou cadastra um pet
    // instanciando Scanner para receber entrada do usuario
    Scanner sc = new Scanner(System.in);
    int asking;
    private String[] values = new String[4];

    public void entry() {
        System.out.println("Seja bem vindo ao Programa Adote seu Pet");
        System.out.print("Escolha a opção desejada: \n1 - cadastro de pet \n2 - adotar um pet \nSua resposta: ");
        this.asking = sc.nextInt();


        if (asking == 1) {
            System.out.println(register());
        } else {
            System.out.println(adopt());
        }

    }

    // metodo para registro do animal
    private String register() {
        int tryAgain;
        do {
            System.out.print("Digite o sexo do animal: ");
            String genre = sc.next();

            System.out.print("Digite a idade do amimal em meses: ");
            String age = sc.next();

            System.out.print("Digite a raça do animal: ");
            String breed = sc.next();

            System.out.print("Digite o porte do animal: ");
            String animalSize = sc.next();

            System.out.println();

            values = new String[]{genre, age, breed, animalSize};

            for (String value : values) {
                System.out.println(value);
            }

            System.out.println();

            System.out.println("Os dados preenchidos acima estão corretos?");
            String confirmData = sc.next();

            if (confirmData.equals("nao")) {
                System.out.print("Deseja tentar novamente \n1 - sim \n2 - não \nSua resposta: ");
                tryAgain = sc.nextInt();
            }
            return "Animal cadastrado";
        } while (tryAgain == 1);


    }

    // metodo onde fica salvos os registros
    private String dataBase() {
        return "";
    }


    // metodo onde o usuario irá interagir com o processo de adoçao
    private String adopt() {
        return "adotar";
    }

}

