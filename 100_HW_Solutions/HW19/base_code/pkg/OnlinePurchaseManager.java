package pkg;
import java.util.ArrayList;


public class OnlinePurchaseManager
{
   double num;
   private ArrayList<Gizmo> purchases;
   

   public OnlinePurchaseManager(){
      num = 0;
   }
   public OnlinePurchaseManager(double num){
      this.num = num;
   }
   public Gizmo getCheapestGizmoByMaker(ArrayList<String> mkr)
   {
   	for(int i = 1; i<purchases.size(); i++){
   	   if(purchases.get(i) < purchases.get(i-1)){
   	      mkr = purchases.get(i);
   	   }
   	}
   }
   public String toString()
   {
   	return "" + purchases;
   }
}
