import akka.actor._
case class ProcessRequest(val name:String)
case class SchedulingDetails(val id:String,val karra:ProcessRequest)


class Scheduler extends Actor{
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

object Main extends App {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(742); 
println("#######################");$skip(73); 
// an actor needs an ActorSystem
val system = ActorSystem("HelloSystem");System.out.println("""system  : akka.actor.ActorSystem = """ + $show(system ));$skip(101); 
// create and start the actor
val helloActor = system.actorOf(Props[Scheduler], name = "helloactor");System.out.println("""helloActor  : akka.actor.ActorRef = """ + $show(helloActor ));$skip(54); 
// send the actor two messages
helloActor ! "refresh";$skip(69); 
//helloActor ! "buenos dias"
// shut down the system
system.shutdown}
}
