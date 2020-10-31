class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    //边界条件判断
    if (strs == null || strs.length == 0)
        return new ArrayList<>();
    Map<String, List<String>> map = new HashMap<>();
    for (String s : strs) {
        char[] ca = new char[26];
        //统计字符串中每个字符串出现的次数
        for (char c : s.toCharArray())
            ca[c - 'a']++;
        //统计每个字符出现次数的数组转化为字符串
        String keyStr = String.valueOf(ca);
        if (!map.containsKey(keyStr))
            map.put(keyStr, new ArrayList<>());
        map.get(keyStr).add(s);
    }
    return new ArrayList<>(map.values());
}

}
