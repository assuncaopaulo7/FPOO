import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentMain {
    public static void main(String[] args) {
        List<Student> alunos = new ArrayList<>();
        alunos.add(new Student("Carlos", 19));
        alunos.add(new Student("Isabela", 21));
        alunos.add(new Student("Joana", 23));

        // 🔹 Criando e salvando alunos corretamente
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoas.ser"))) {
            for (Student aluno : alunos) {
                oos.writeObject(aluno);
            }
            System.out.println("Objetos salvos com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 🔹 Lendo os objetos do ficheiro
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pessoas.ser"))) {
            while (true) {
                try {
                    Student aluno = (Student) ois.readObject();
                    System.out.println("Nome: " + aluno.name + ", Idade: " + aluno.age);
                } catch (EOFException e) {
                    System.out.println("Fim do ficheiro alcançado.");
                    break; // Sai do loop ao atingir o fim do arquivo
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
