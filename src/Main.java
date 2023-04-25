import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int op;

        ArrayList <Users> Usuarios = new ArrayList<>();


        do {
            System.out.println("""
                    ===================================================
                                    Menu
                                   1- Adicionar um Cliente
                                   2- Mostrar os clientes
                                   3- Modificar os clientes
                                   4- Remover um cliente
                    """);

            op = reader.nextInt();
            reader.nextLine();

            switch (op){
                case 1:
                    System.out.printf("insira os dados do usuario informe primeiro o nome\n ");
                    String nome = reader.nextLine();
                    System.out.printf("insira os dados do usuario informe email\n ");
                    String email = reader.nextLine();
                    System.out.printf("insira os dados do usuario informe senha\n ");
                    String senha = reader.nextLine();
                    System.out.printf("insira os dados do usuario informe endereço\n ");
                    String endereco = reader.nextLine();
                    System.out.printf("insira os dados do usuario informe sua area de desenvolvimento\n ");
                    String area = reader.nextLine();
                    System.out.printf("insira os dados do usuario informe email\n ");
                    Boolean dispo = reader.nextBoolean();
                    System.out.printf("insira os dados do usuario informe salario: \n ");
                    Double salario = reader.nextDouble();
                    System.out.printf("insira os dados do usuario informe Sexo M ou F ou O\n ");
                    String sexo = reader.next();
                    System.out.printf("insira os dados do usuario informe celular\n ");
                    String celular = reader.nextLine();
                    System.out.printf("insira os dados do usuario informe linked\n ");
                    String linked = reader.nextLine();


                   Usuarios.add( new Users(nome,email,senha,endereco,area,dispo,sexo,salario,celular,linked));
                    break;
                case 2:
                    System.out.println(Usuarios);
                    break;
                case 3:
                    System.out.println("Por favor escreva o nome de um usuario: ");
                    String mudaNome = reader.nextLine();
                    System.out.println("Novo nome: ");
                    String nome = reader.next();
                    if(Usuarios.contains(mudaNome)){
                        Usuarios.remove(mudaNome);
                        Usuarios.add(nome); // Correr atras da respostas

                        System.out.println("Produto Alterado\n");
                    }else {
                        System.out.println("Produto não localizado");
                    }
                    System.out.println("O produto foi editado com sucesso: ");

                    break;
                case 4:
                    System.out.println("=================================");
                    System.out.println("Qual o produto que deseja remover ?");
                    String retirar = reader.nextLine();
                    if(Usuarios.contains(retirar)){
                        Usuarios.remove(retirar);
                        System.out.println("Produto foi excluido");
                    }else {
                        System.out.println("Agora a seu estoque ficou assim: ");
                        System.out.println(Usuarios);
                    }
                    break;
                default:
                    System.out.println("Opção invalida, escolha outra opção");
            }
        }while (op != 0);
    }
}
