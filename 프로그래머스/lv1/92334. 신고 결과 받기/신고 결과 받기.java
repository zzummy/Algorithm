import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 신고당한 사람은 중복될 수 없으므로 Set 사용
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> countMap = new HashMap<>();
        
        // Map 초기화
        for(int i=0; i<id_list.length; i++){
            reportMap.put(id_list[i], new HashSet<>());
        }
        
        for(int i=0; i<report.length; i++){
            String[] r = report[i].split(" ");
            String reporter = r[0];     // reporter : 신고한 사람
            String reported = r[1];     // reported : 신고당한 사람
            
            // reporter가 동일 reported 신고 불가 (한 번만 가능)
            // 한 reporter가 같은 reported를 신고했을 경우 사용
            boolean flag = false;       
            
            if(reportMap.containsKey(reporter)){
                // 이미 신고한 reported를 또 신고했을 경우
                if(reportMap.get(reporter).contains(reported)) 
                    flag = true;
                else
                    reportMap.get(reporter).add(reported);   
            }else{
                reportMap.get(reporter).add(reported);
            }
            
            if(flag){
                continue;
            }else{
                countMap.put(reported, countMap.getOrDefault(reported, 0) + 1);
            }
        }
        
        for(String reported : countMap.keySet()){
            int cnt = countMap.get(reported);
            
            // 메일 발송
            if(cnt >= k){
                for(int i=0; i<id_list.length; i++){
                    if(reportMap.get(id_list[i]).contains(reported))
                        answer[i]++;
                    else if(reportMap.get(id_list[i]) == null)
                        answer[i] = 0;
                }
            }
        }        
        
        return answer;
    }
}