val s = "Casa de tolos"
s.toLowerCase map( (_,1)) groupBy(_._1) map( x => (x._1, x._2.length))

val l = List((1,2), (1,3))
l.map( x => x._2)