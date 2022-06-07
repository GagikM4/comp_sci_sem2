package pkg;

public class Gizmo
{ 
   String name;
   boolean bool;
   public Gizmo(){
      name = "sony";
      bool = true;
   }
   public Gizmo(String name, boolean bool){
      this.name = name;
      this.bool = bool;
   }
   public String getMaker(){
      return name;
   }
   public boolean isElectronic(){
      return bool;
   }
   public String toString()
   {
   	return "" + maker + " " + isE + " " + cost;
   }
}
