object AkkaExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(24); 
  
  
  println("ghgh")}
  
}
import akka.actor._
case class ProcessRequest(val name:String)
case class SchedulingDetails(val id:String,val karra:ProcessRequest)


class bb extends Actor{
val REFRESH="refresh"
val processRequest1=ProcessRequest("name1")
val processRequest2=ProcessRequest("name2")
val processRequest3=ProcessRequest("name3")

def receive={
case REFRESH =>
val schedulingDetails=List(SchedulingDetails("1",processRequest1),SchedulingDetails("2",processRequest2),SchedulingDetails("3",processRequest3))
schedulingDetails map{details=>
self ! SchedulingDetails(details.id,details.karra)
}

case SchedulingDetails(id,karra)=>
println("#####id####"+id)
println("#####karra####"+karra)

}


}
