import java.io.*;

public class ProjetoPOO{

//Código trabalho POO:

//Este código é um programa Java que lê dados de um arquivo CSV chamado #"students.csv" e escreve os dados em um novo arquivo CSV 
//chamado #"students_weighted_avg.csv", juntamente com uma nova coluna para a média #ponderada das notas dos alunos. O programa usa 
//as classes BufferedReader e #BufferedWriter para ler e escrever, respectivamente, nos arquivos CSV. O programa #também usa as classes 
//FileReader e FileWriter para lidar com a entrada e saída de #arquivos. O programa divide cada linha do arquivo CSV de entrada usando o 
//método #"split" e atribui os valores resultantes para variáveis de ID do estudante, nome do #estudante e três notas. O programa, então, 
//calcula a média ponderada das notas #usando um fator de ponderação específico e escreve os dados do estudante, #incluindo a média ponderada, 
//no novo arquivo CSV. O programa também inclui um #bloco try-catch para lidar com exceções IOExceptions que podem ocorrer enquanto #se lê ou escreve os arquivos.

    public static void main(String[] args) {
        String inputFile = "src/notas.csv";
        String outputFile = "Notas_alunos_media.csv";
        String line = ""; //
        String COMMA = ","; // Constante vírgula



        try (BufferedReader br = new BufferedReader(new FileReader(inputFile)); //Inicializando os objetos "FileReader" e "BufferedReader" para abrir o ficheiro
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) { //Inicializando os objetos "FileWrite" e "BufferedWrite" para abrir o ficheiro
            // Escreve a primeira linha do cabeçalho no novo arquivo
            bw.write("Número do aluno, Nome, Nota 1, Nota 2, Nota 3, Média Ponderada"); // Cabeçalho da novo ficheiro
            bw.newLine();  // Pular para a próxima linha
            br.readLine(); // Pular a primeira linha que representa o nome das colunas
            while ((line = br.readLine()) != null) { //Loop para leitura de cada linha que para quando tiver uma linha vazia.
                String[] outputFileStrings = line.split(COMMA); //Instrução para fazer a separação das colunas pela a constante COMMA (",")
                String[] student = line.split(COMMA);
                int studentID = Integer.parseInt(student[0]);
                String studentName = student[1];
                double grade1 = Double.parseDouble(student[2]);
                double grade2 = Double.parseDouble(student[3]);
                double grade3 = Double.parseDouble(student[4]);

                double weightedAvg = ((grade1 * 0.4) + (grade2 * 0.4) + (grade3 * 0.2)); // Cálculo para fazer a média ponderada das notas

                // Escreve os dados do aluno no novo arquivo, incluindo a média ponderada
                bw.write(studentID + "," + studentName + "," + grade1 + "," + grade2 + "," + grade3 + "," + weightedAvg);
                bw.newLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
