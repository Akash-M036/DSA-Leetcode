class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean b1 =false;
      //  boolean b2=false;
      if(rec1[1]==rec1[3]) return false;
      if(rec2[1]==rec2[3]) return false;
      if(rec1[0]==rec2[0] && rec1[1]==rec2[1] && rec1[2]==rec2[2] && rec2[3]==rec1[3])
            return true;
        if(rec1[0]<rec2[0] && rec1[1]<rec2[1]){
            return rec1[2]>rec2[0] && rec1[3]>rec2[1];
        }
        if(rec1[0]== rec2[0] && (rec1[1]<rec2[1]))
            return rec2[1]<rec1[3];
        if(rec1[1]== rec2[1] && (rec1[0]<rec2[0]))
            return rec2[0]<rec1[2];
        if(rec2[0]<rec1[0] && rec2[1]<rec1[1]){
            return rec2[2]>rec1[0] && rec2[3]>rec1[1];
        }
        if(rec2[0]== rec1[0] && (rec2[1]<rec1[1]))
           return rec1[1]<rec2[3];
        if(rec2[1]== rec1[1] && (rec2[0]<rec1[0]))
            return  rec2[0]<rec1[2];
         if(rec1[0]<rec2[0] && rec1[1]>rec2[1]){
            return rec1[2]>rec2[0] && rec2[3]>rec1[1];
         }
        if(rec2[0]<rec1[0] && rec2[1]>rec1[1]){
            return rec2[2]>rec1[0] && rec1[3]>rec2[1];
        }
     return false;   
    }
}