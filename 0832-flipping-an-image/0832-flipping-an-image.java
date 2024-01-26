class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] img: image){
            flipInvert(img);
        }
        return image;
    }
    
    private void flipInvert(int[] img){
        int n = img.length;
        int start = 0, end = n-1;
        while(start <= end){
            int temp = Math.abs(img[start]-1);
            img[start] = Math.abs(img[end]-1);
            img[end] = temp;
            start++; end--;
        }
    }
}