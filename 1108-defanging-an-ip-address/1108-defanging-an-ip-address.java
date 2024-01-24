class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder("");
        sb.append(address.charAt(0));
        for(int i = 1; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                sb.append('[');
                sb.append(address.charAt(i));
                sb.append(']');
            }else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}