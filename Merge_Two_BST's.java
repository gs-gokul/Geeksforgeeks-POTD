class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public void solve(Node root, List<Integer> arr){
        if(root!=null){
            solve(root.left,arr);
            arr.add(root.data);
            solve(root.right,arr);
        }
    }
    
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        solve(root1, arr1);
        solve(root2, arr2);
        
        int i=0,j=0,i1=arr1.size(),j1=arr2.size();
        List<Integer> res = new ArrayList<>();
        
        while(i<i1 && j<j1){
            if(arr1.get(i)<arr2.get(j)){
                res.add(arr1.get(i));
                i++;
            }
            else{
                res.add(arr2.get(j));
                j++;
            }
        }
        
        while(i<i1){
            res.add(arr1.get(i));
            i++;
        }
        while(j<j1){
            res.add(arr2.get(j));
            j++;
        }
        
        return res;
        
    }
}