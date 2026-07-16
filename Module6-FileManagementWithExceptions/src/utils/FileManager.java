package utils;

import model.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class FileManager {

    private static final String FILE_PATH =
            "src/data/products.txt";

    public static void createFile() {

        File file = new File(FILE_PATH);

        try {

            if (file.createNewFile()) {

                System.out.println(
                        "Product file created successfully."
                );

            } else {

                System.out.println(
                        "Product file already exists."
                );

            }

        } catch (IOException e) {

            System.out.println(
                    "Error creating file."
            );

            e.printStackTrace();

        }

    }
        public static void writeProduct (Product product){

            try (

                    FileWriter fileWriter =
                            new FileWriter(FILE_PATH, true);

                    BufferedWriter bufferedWriter =
                            new BufferedWriter(fileWriter)

            ) {

                bufferedWriter.write(product.toString());

                bufferedWriter.newLine();

                System.out.println(
                        "Product saved successfully."
                );

            } catch (IOException e) {

                System.out.println(
                        "Unable to save product."
                );

            }

        }

    public static void readProducts() {

        try (

                FileReader fileReader =
                        new FileReader(FILE_PATH);

                BufferedReader bufferedReader =
                        new BufferedReader(fileReader)

        ) {

            String line;

            System.out.println("\n===== Products =====\n");

            while ((line = bufferedReader.readLine()) != null) {

                String[] data = line.split(",");

                System.out.println("ID      : " + data[0]);
                System.out.println("Name    : " + data[1]);
                System.out.println("Price   : Rs. " + data[2]);

                System.out.println();

            }

        }

        catch (IOException e) {

            System.out.println("Unable to read file.");

        }

    }

    public static Product searchProduct(int productId) {

        try (

                FileReader fileReader =
                        new FileReader(FILE_PATH);

                BufferedReader bufferedReader =
                        new BufferedReader(fileReader)

        ) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] data = line.split(",");

                int id =
                        Integer.parseInt(data[0]);

                if (id == productId) {

                    String name = data[1];

                    double price =
                            Double.parseDouble(data[2]);

                    return new Product(
                            id,
                            name,
                            price
                    );

                }

            }

        }

        catch (IOException e) {

            System.out.println("Unable to search product.");

        }

        return null;

    }

    public static boolean deleteProduct(int productId) {

        File inputFile = new File(FILE_PATH);

        File tempFile = new File("src/data/temp.txt");

        boolean deleted = false;

        try (

                BufferedReader reader =
                        new BufferedReader(
                                new FileReader(inputFile)
                        );

                PrintWriter writer =
                        new PrintWriter(tempFile)

        ) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                int id =
                        Integer.parseInt(data[0]);

                if (id == productId) {

                    deleted = true;

                    continue;

                }

                writer.println(line);

            }

        }

        catch (IOException e) {

            System.out.println("Unable to delete product.");

            return false;

        }

        if (inputFile.delete()) {

            tempFile.renameTo(inputFile);

        }

        return deleted;

    }

    }