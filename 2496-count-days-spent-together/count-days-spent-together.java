class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        String[] arrAlice = arriveAlice.split("-");
        int arrAliceMonth  = Integer.parseInt(arrAlice[0]);
        int arrAliceDay = Integer.parseInt(arrAlice[1]);
        
        String[] depAlice = leaveAlice.split("-");
        int depAliceMonth  = Integer.parseInt(depAlice[0]);
        int depAliceDay = Integer.parseInt(depAlice[1]);
        
        String[] arrBob = arriveBob.split("-");
        int arrBobMonth  = Integer.parseInt(arrBob[0]);
        int arrBobDay = Integer.parseInt(arrBob[1]);
        
        String[] depBob = leaveBob.split("-");
        int depBobMonth  = Integer.parseInt(depBob[0]);
        int depBobDay = Integer.parseInt(depBob[1]);
        
        String start ="";
        String end = "";
        
        if(arrAliceMonth<=arrBobMonth){
            if(arrAliceMonth==arrBobMonth){
                if(arrAliceDay<=arrBobDay){
                    start = arrBobMonth+"-"+arrBobDay;
                }
                else{
                    start = arrAliceMonth+"-"+arrAliceDay;
                }
            }
            else{
                start = arrBobMonth+"-"+arrBobDay;
            }
        }
        else{        
             start = arrAliceMonth+"-"+arrAliceDay;
        }
        
        if(depAliceMonth<=depBobMonth){
            if(depAliceMonth==depBobMonth){
                if(depAliceDay<=depBobDay){
                    end = depAliceMonth+"-"+depAliceDay;
                }
                else{
                    end = depBobMonth+"-"+depBobDay;
                }
            }
            else{
                end = depAliceMonth+"-"+depAliceDay;
            }
        }
        else{
            end = depBobMonth+"-"+depBobDay;
        }
        
        String[] startParts = start.split("-");
        String[] endParts = end.split("-");
        
        int startMonth = Integer.parseInt(startParts[0]);
        int startDay = Integer.parseInt(startParts[1]);
        int endMonth = Integer.parseInt(endParts[0]);
        int endDay = Integer.parseInt(endParts[1]);
        
        if (startMonth > endMonth || (startMonth == endMonth && startDay > endDay)) {
            return 0;
        }
        
        int diffmonth = endMonth - startMonth;
        if(diffmonth==0){
            return endDay - startDay + 1;
        }
        
        int ans = 0;
        int x = startMonth;
        ans += days[x-1] - startDay + 1;
        x++;
        
        int y = endMonth;
        while(x<y){
            ans += days[x-1];
            x++;
        }
        
        ans += endDay;
        return ans;
    }
}
