import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> result = new HashMap<String, Set<String>>();
        int size = id_list.length;
        for(int i=0; i<size; i++) {
        	result.put(id_list[i], new HashSet<>());
        }
        size = report.length;
        for(int i=0; i<size; i++) {
        	StringTokenizer st = new StringTokenizer(report[i]," ");
        	String user1 = st.nextToken();//신고한 사람
        	String user2 = st.nextToken();//신고당한 사람
        	Set<String> set = result.get(user2);
        	set.add(user1);
        	result.put(user2, set);
        	
        }
        
        size = id_list.length;
        for(int i=0; i<size; i++) {
        	String str = id_list[i];
        	for(int j=0; j<size; j++) {
        		if(str.equals(id_list[j])) {
        			continue;
        		}
        		Set<String> set = result.get(id_list[j]);
        		if(set.size() >= k && set.contains(str)) {
        			answer[i]++;
        		}
        		
        	}
        	
        }
        
        return answer;
    }
}