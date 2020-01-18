package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-09-12 11:06
 **/

public class 图像渲染 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        LinkedList<int[]> linkedList = new LinkedList<>();
        linkedList.add(new int[]{sr,sc});
        int oldColor = image[sr][sc];
        if(oldColor==newColor)
            return image;
        while (linkedList.size()>0){
            int[] point = linkedList.poll();
            int x= point[0];
            int y = point[1];
            if(isArea(image,x,y)&&image[x][y]==oldColor) {
                image[x][y] = newColor;
                linkedList.add(new int[]{x,y-1});
                linkedList.add(new int[]{x,y+1});
                linkedList.add(new int[]{x+1,y});
                linkedList.add(new int[]{x-1,y});
            }
        }
        return image;
    }
    public boolean isArea(int[][] image,int x,int y ){
        return x>=0&&x<image.length
                && y>=0&&y<image[0].length;
    }

    public static void main(String[] args) {
        图像渲染 sr = new 图像渲染();
        int[][]images = new int[][]{
                {1,1,1,},
                {1,1,0},
                {1,0,1}
        };
        sr.floodFill(images,1,1,2);
        for (int i = 0; i < images.length; i++) {
            for (int j = 0; j < images[0].length; j++) {
                System.out.print(images[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
