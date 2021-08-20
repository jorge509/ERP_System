package example_read_csv;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Produto{
    private String id;
    private String nome;
    private String category;
    private String brand;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

public class Example {

    public static void main(String[] args) throws IOException {

        String fileName = "C:\\data\\Products.csv";
        ArrayList<Produto> produtos=new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> produtoFile = reader.readAll();
            // r.forEach(x -> System.out.println(Arrays.toString(x)));

            for (String[] produto : produtoFile) {
               Produto prod = new Produto();
                prod.setId(produto[0]);
                prod.setNome(produto[20]);
                produtos.add(prod);
            }

System.out.println(produtos.get(0));
    } catch (CsvException e) {
            e.printStackTrace();
        }
    }
}


