class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] img: image){
            flipInvert(img);
        }
        return image;
    }
    
    private void flipInvert(int[] img){
        int n = img.length;
        for(int i = 0; i < n/2; i++){
            int temp = img[i];
            img[i] = img[n-1-i];
            img[n-1-i] = temp;
        }
        for(int i = 0; i < n; i++){
            img[i] = Math.abs(img[i]-1);
        }
    }
}