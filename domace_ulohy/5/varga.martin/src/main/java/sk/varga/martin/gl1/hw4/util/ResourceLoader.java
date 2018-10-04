package sk.varga.martin.gl1.hw4.util;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import sk.varga.martin.gl1.hw4.models.Matrix;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ResourceLoader {

    public Matrix returnMatrixFromResource(String fileName) throws IOException {
        InputStream inputStream = ResourceLoader.class.getResourceAsStream("/" + fileName);
        if(inputStream == null){
            throw  new FileNotFoundException("unable to find resource:" + fileName);
        }

        String resouceString = "";

        try {
            resouceString = IOUtils.toString(inputStream, Charset.defaultCharset());
        }
        finally {
            inputStream.close();
        }

        String[] rows = resouceString.split("\r\n");

        int matrixWidth = rows[0].split(",").length;
        Assert.assertTrue("Matrix has to contain at least 1 row!", matrixWidth > 0);
        int matrixHeight = rows.length;
        Assert.assertTrue("Matrix has to contain at least 1 column!", matrixHeight > 0);

        Matrix m = new Matrix(matrixHeight, matrixWidth);

        for (int i = 0; i < matrixHeight; i++) {
            String[] rowSplit = rows[i].split(",");
            Assert.assertTrue("Matrix row length has to be same for each row", rowSplit.length == matrixWidth);
            for (int j = 0; j < matrixWidth; j++) {
                m.setValue(i,j, Integer.valueOf(rowSplit[j]));
            }
        }
        return m;
    }
}


