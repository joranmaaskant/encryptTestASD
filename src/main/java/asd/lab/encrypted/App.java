package asd.lab.encrypted;


import java.io.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws IOException {

        File file = new File("encrypt.txt");
        String originalString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas quis libero dictum, molestie mi at, sagittis risus. Maecenas elit felis, bibendum eget tincidunt quis, malesuada nec est. Donec varius ut risus ac mollis. Vivamus commodo dui at mi posuere volutpat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Nunc risus nunc, consectetur a lectus in, pulvinar porttitor massa. Mauris tempor libero libero, non gravida erat maximus sed. Morbi varius vulputate lectus nec mattis. Donec quis nisl consequat, auctor velit mollis, fermentum augue.\n" +
                "\n" +
                "Maecenas aliquam diam non lacus tempor, sit amet facilisis quam vulputate. Aliquam non nisl ligula. Fusce non tortor vel justo sagittis ultrices sed quis nulla. Ut auctor ullamcorper vehicula. Etiam mollis, massa non venenatis ullamcorper, enim elit consequat neque, porta maximus orci erat at tellus. Duis congue massa at dui fermentum, et bibendum massa venenatis. Nulla placerat, sem non volutpat viverra, lacus neque volutpat massa, id gravida lacus quam in augue. Vestibulum ultricies tellus ac dolor finibus sollicitudin. Nulla at suscipit libero, id laoreet augue. Sed sed orci laoreet, ornare ante at, vestibulum nibh. Curabitur urna enim, lobortis quis venenatis rutrum, pretium id eros. Proin faucibus ligula lectus, vel bibendum arcu consequat quis.\n" +
                "\n" +
                "Nulla facilisi. Nullam egestas, risus at tincidunt consequat, lectus nulla egestas lorem, et vulputate eros ligula sed ante. Donec placerat dolor eleifend arcu lacinia ullamcorper. Sed auctor, lorem sed rhoncus ullamcorper, ligula justo congue nunc, at posuere nulla sem suscipit sem. Maecenas dictum arcu quam, et iaculis quam ornare quis. Integer sed odio gravida, ullamcorper nisl eu, feugiat ante. Nullam vehicula ex malesuada laoreet pellentesque. Integer molestie massa eros, sed malesuada neque convallis ac. Pellentesque gravida rutrum eros non suscipit. In bibendum, dui a blandit laoreet, nisi ante sagittis ex, quis dapibus risus felis sit amet est. Etiam scelerisque, neque ac ullamcorper eleifend, felis sem facilisis ex, tempus dictum arcu mauris eu justo. Phasellus fermentum dignissim tellus eget consectetur. Vivamus luctus ex ultrices, lobortis tellus ac, pulvinar nulla.\n" +
                "\n" +
                "Nam at molestie velit. Proin ac odio elementum, lobortis lorem ut, facilisis augue. Sed vitae dignissim felis, auctor tincidunt tortor. Suspendisse eu nisi id mauris tincidunt vestibulum. In quis odio fringilla, tincidunt urna at, egestas neque. Cras orci justo, imperdiet ac felis vitae, posuere aliquam diam. Fusce non aliquet libero. Nullam euismod nibh magna, egestas congue turpis mattis sed. Aliquam id nulla eu augue placerat tempus a ut enim. Suspendisse lacinia metus sit amet urna finibus tincidunt. Donec efficitur fringilla tellus, vel dignissim tortor dapibus hendrerit. Maecenas ultricies luctus eros non ultricies. Aliquam eget velit augue.\n" +
                "\n" +
                "Integer lectus elit, mattis nec nunc sit amet, imperdiet egestas nunc. Nam eleifend turpis auctor libero scelerisque mollis. Morbi a congue mi, in dictum dui. Donec rhoncus ullamcorper nisl. Donec sit amet magna eros. Cras nisi dui, eleifend et lobortis iaculis, hendrerit at massa. Phasellus euismod pulvinar luctus.";


        System.out.println("==========================Ecrypt====================================");
            new EncryptTest(originalString, file);
        System.out.println("==========================Non Ecrypt================================");
            new NonEcryptTest(originalString,file);


    }



}
