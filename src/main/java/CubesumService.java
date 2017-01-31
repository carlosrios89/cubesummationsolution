/**
 * Created by carrio1 on 1/30/17.
 */
public class CubesumService {

    Integer cube [][][] = new Integer [100][100][100];


    public String getCubeUpdate(int x, int y, int z, int value) {

        cube [x][y][z] = value;

        return String.valueOf(cube);

    }

    public Double getCubeQuery(int x1, int y1, int z1, int x2, int y2, int z2) {

        

    }


}
