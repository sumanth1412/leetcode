class Solution {
    public int maxNumberOfBalloons(String text) {
      HashMap<Character,Integer> Counter = new HashMap<>();
      for(char c:text.toCharArray()){
        Counter.put(c,Counter.getOrDefault(c,0)+1);    
         }  
    int b = Counter.getOrDefault('b', 0);
    int a = Counter.getOrDefault('a', 0);
    int l = Counter.getOrDefault('l', 0) / 2; // 'l' appears twice
    int o = Counter.getOrDefault('o', 0) / 2; // 'o' appears twice
    int n = Counter.getOrDefault('n', 0);
    return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}