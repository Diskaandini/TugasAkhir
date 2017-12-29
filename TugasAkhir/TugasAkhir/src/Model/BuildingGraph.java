// *
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// 
package Model;

///**
// *
// * @author VELIA
// */
public class BuildingGraph {
//    Connection conn = null;
//    ResultSet rs = null;
//    PreparedStatement pstmt = null;    
//    private Graph graph;
//    private Area area;
//    private Double[][] matrix;
//    private Viewer viewer;
//    String styleSheet
//            = "node.corridor1 {"
//            + "	fill-color: red;"
//            + "}"
//            + "node.corridor2 {"
//            + "	fill-color: green;"
//            + "}"
//            + "node.corridor3 {"
//            + "	fill-color: blue;"
//            + "}"
//            + "node.room {"
//            + "	fill-color: grey;"
//            + "}"
//            + "node.stair {"
//            + "	fill-color: yellow;"
//            //            + "size: 5px;"
//            //            + "text-size: 6px;"
//            + "}"
//            //            + "node.marked {"
//            //            + "	fill-color: black;"
//            //            + "}"
//            + "sprite {"
//            + "shape: box;"
//            + "size: 32px, 52px;"
//            + "fill-mode: image-scaled;"
//            + "fill-image: url('mapPinSmall.png');"
//            + "}"
//            + "node {"
//            + "shape: box;"
//            + "size: 10px, 10px;"
//            + "text-size: 8px;"
//            + "}";
//    
//     private ArrayList<Segments> segments;
//     
//     public Graph getGraph() {
//        return graph;
//    }
//
//    public void setGraph(Graph graph) {
//        this.graph = graph;
//    }
//    
//    public void addNode(String idNode) {
//        graph.addNode(idNode);
//    }
//
//    public Node getNode(String idNode) {
//        return graph.getNode(idNode);
//    }
//
//    public void modifyNode(String idNode, String key, Object attribute) {
//        graph.getNode(idNode).addAttribute(key, attribute);
//    }
//
//    public BuildingGraph(Area area) {
//        this.graph = new MultiGraph(area.getAreaName());
//        this.area = area;
//        segments = new ArrayList<>();
//    }
//    
//    public void createGraph() throws SQLException, ClassNotFoundException {
//        int i = 0, j;
//        while (i < area.getBuildingList().size()) {
//            Building b = area.getBuildingList().get(i);
//            j = 0;
//            while (j< b.getRoom().size()) {
//                Room room = b.getRoom().get(j);
//                graph.addNode(room.getRoom_code());
//                graph.getNode(room.getRoom_code()).setAttribute("x", room.getLongi()+room.getZ()/100);
//                graph.getNode(room.getRoom_code()).setAttribute("y", room.getLati() - room.getZ()/100);
//                graph.getNode(room.getRoom_code()).setAttribute("z", room.getZ());
//                graph.getNode(room.getRoom_code()).setAttribute("latitude", room.getLati());
//                graph.getNode(room.getRoom_code()).setAttribute("longitude", room.getLongi());
//                graph.getNode(room.getRoom_code()).addAttribute("ui.style", "fill-color: grey; ");
//                //size: 5px;text-size: 6px;");
//                j++;
//            }
//                
//            j = 0;
//            while (j < b.getCorridor().size()) {
//                Corridor cor = b.getCorridor().get(j);
//                graph.addNode(cor.getCorridor_ID());
//                graph.getNode(cor.getCorridor_ID()).addAttribute("x", cor.getLongi() + cor.getZ() / 10000);
//                graph.getNode(cor.getCorridor_ID()).addAttribute("y", (cor.getLati() - cor.getZ() / 10000) * -1);
//                graph.getNode(cor.getCorridor_ID()).addAttribute("z", cor.getZ());
//                graph.getNode(cor.getCorridor_ID()).addAttribute("roofed", cor.getRoofed());
//                graph.getNode(cor.getCorridor_ID()).addAttribute("latitude", cor.getLati());
//                graph.getNode(cor.getCorridor_ID()).addAttribute("longitude", cor.getLongi());
//                graph.getNode(cor.getCorridor_ID()).addAttribute("ui.class", "corridor",+ cor.getZ());
//
//                j++;
//            }
//            j = 0;
//            while (j < b.getStairs().size()) {
//                Stair stair = b.getStairs().get(j);
//                graph.addNode(stair.getStair_ID());
//                graph.getNode(stair.getStair_ID()).addAttribute("x", stair.getLongi() + stair.getZ() / 10000);
//                graph.getNode(stair.getStair_ID()).addAttribute("y", (stair.getLati() - stair.getZ() / 10000) * -1);
//                graph.getNode(stair.getStair_ID()).addAttribute("z", stair.getZ());
//                graph.getNode(stair.getStair_ID()).addAttribute("latitude", stair.getLati());
//                graph.getNode(stair.getStair_ID()).addAttribute("longitude", stair.getLongi());
//                graph.getNode(stair.getStair_ID()).addAttribute("ui.class", "stair");
//                j++;
//            }
//            i++;
//        }
//
//        for (int k = 0; k < area.getCorridorList().size(); k++) {
//            Corridor cor = area.getCorridorList().get(k);
//            graph.addNode(cor.getCorridor_ID());
//            graph.getNode(cor.getCorridor_ID()).addAttribute("x", cor.getLongi() + cor.getZ() / 10000);
//            graph.getNode(cor.getCorridor_ID()).addAttribute("y", (cor.getLati() - cor.getZ() / 10000) * -1);
//            graph.getNode(cor.getCorridor_ID()).addAttribute("z", cor.getZ());
//            graph.getNode(cor.getCorridor_ID()).addAttribute("roofed", cor.getRoofed());
//            graph.getNode(cor.getCorridor_ID()).addAttribute("latitude", cor.getLati());
//            graph.getNode(cor.getCorridor_ID()).addAttribute("longitude", cor.getLongi());
//            if (cor.getRoofed().equals("y")) {
//                graph.getNode(cor.getCorridor_ID()).addAttribute("ui.style", "fill-color: pink;size: 15px;text-size: 6px;");
//            } else if (cor.getRoofed().equals("n")) {
//                graph.getNode(cor.getCorridor_ID()).addAttribute("ui.style", "fill-color: purple;size: 15px;text-size: 6px;");
//            }
//        }
//        loadSegments();
//        createEdge();
//    }
//
//    public void loadSegments() throws SQLException, ClassNotFoundException {
//        conn= Database.ConnectDB();        
//        ArrayList<Segments> segmentsList;        
//        String query = "select * from segments";
//        pstmt =conn.prepareStatement(query);
//        rs = pstmt.executeQuery();
//        segmentsList = (ArrayList<Segments>) conn.prepareStatement(query);
//        int idx = 0;
//        while (rs.next()) {
//            segments.add(new Segments(rs.getString("source") + "&" + rs.getString("destination"), rs.getString("source"), rs.getString("destination")));
//            Double length = null;
//            if (rs.getString("source").charAt(0) == 'S' && rs.getString("destination").charAt(0) == 'S') {
//                length = 7.0;
//            } else {
////                System.out.println(idx + " " + graph.getNode(rs.getString("source")) + " " + graph.getNode(rs.getString("destination")));
//                Double startLati = (Double) graph.getNode(rs.getString("source")).getAttribute("latitude");
//                Double startLongi = (Double) graph.getNode(rs.getString("source")).getAttribute("longitude");
//                Double endLati = (Double) graph.getNode(rs.getString("destination")).getAttribute("latitude");
//                Double endLongi = (Double) graph.getNode(rs.getString("destination")).getAttribute("longitude");
//                length = distanceMeasure(startLati, startLongi, endLati, endLongi );
//            }
//            segments.get(idx).setLength(length);
//            //System.out.println(idx + rs.getString("source") + "&" + rs.getString("destination") + " " + rs.getString("source") + " " + rs.getString("destination") + " " + length);
//            idx++;
//        }
//
//    }
//
//    private void createEdge() {
//        //        System.out.println("----- create edges -----" + segments.size());
//        for (Segments s : segments) {
//            if (graph.getEdge(s.getNo()) == null) {
//                graph.addEdge(s.getNo(), s.getSource(), s.getDestination(), false).addAttribute("length", s.getLength());
//                if (graph.getNode(s.getSource()).getAttribute("z").equals(graph.getNode(s.getDestination()).getAttribute("z"))) {
//                    graph.getEdge(s.getNo()).addAttribute("z", (Double) graph.getNode(s.getSource()).getAttribute("z"));
//                } else if ((Double) graph.getNode(s.getSource()).getAttribute("z") > (Double) graph.getNode(s.getDestination()).getAttribute("z")) {
//                    graph.getEdge(s.getNo()).addAttribute("z", (Double) graph.getNode(s.getSource()).getAttribute("z"));
//                } else if ((Double) graph.getNode(s.getSource()).getAttribute("z") < (Double) graph.getNode(s.getDestination()).getAttribute("z")) {
//                    graph.getEdge(s.getNo()).addAttribute("z", (Double) graph.getNode(s.getDestination()).getAttribute("z"));
//                }
////            System.out.println("EDGE " + s.getId() + " " + s.getSource() + " " + s.getDestination() + " " + s.getLength());
//            }
//        }
//    }
//
//    public Double distanceMeasure(Double lat1, Double lon1, Double lat2, Double lon2) {  // generally used geo measurement function
//        Double r = 6378.137; // Radius of earth in KM
////        System.out.println(lat1+" "+lon1+" "+lat2+" "+lon2);
//        Double dLat = lat2 * Math.PI / 180 - lat1 * Math.PI / 180;
//        Double dLon = lon2 * Math.PI / 180 - lon1 * Math.PI / 180;
//        Double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
//                + Math.cos(lat1 * Math.PI / 180) * Math.cos(lat2 * Math.PI / 180)
//                * Math.sin(dLon / 2) * Math.sin(dLon / 2);
//        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
//        Double d = r * c;
//        return d * 1000; // meters
//    }
//    
//    public Viewer showGraph() {
//        for (Node node : graph) {
//            node.addAttribute("ui.label", node.getId());
//        }
////        for (Edge e : graph.getEachEdge()) {
////            e.addAttribute("label", "" + (Double) e.getNumber("length"));
////        }
//
//        graph.setStrict(false);
//        graph.setAutoCreate(true);
//        graph.addAttribute("ui.stylesheet", styleSheet);
//        graph.addAttribute("ui.quality");
//        graph.addAttribute("ui.antialias");
//        //viewer = graph.display(false);
////        Viewer viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
//        viewer.disableAutoLayout();
//        viewer.addDefaultView(false);
//        viewer.getDefaultView().setAutoscrolls(true);
//
////        viewer.getDefaultView().getCamera().setViewPercent(0.25);
//        viewer.getDefaultView().setSize(1080, 710);
//
////        View view = viewer.addDefaultView(false);  
////        Clicks clicks = new Clicks(graph);
//        return viewer;
////        viewer.enableAutoLayout();
//    }
//
//    
//    public void resetGraphStyle() throws SQLException, ClassNotFoundException {
//        graph.clear();
//        createGraph();
//        graph.addAttribute("ui.stylesheet", styleSheet);
//        graph.addAttribute("ui.quality");
//        graph.addAttribute("ui.antialias");
//        for (Node node : graph) {
//            node.addAttribute("ui.label", node.getId());
//        }
//    }
//    
//    public String dijkstraAlgo(String source, String dest) {
//        System.out.println("*****" + "dijkstra algorithm node " + source + " to "
//                + dest + "*****");
//        // Edge lengths are stored in an attribute called "length"
//        // The length of a path is the sum of the lengths of its edges
//        Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, "length");
//
//        // Now compute the shortest path from source to all the other nodes
//        // but taking the number of nodes in the path as its length
//        dijkstra = new Dijkstra(Dijkstra.Element.NODE, null, null);
//        dijkstra.init(graph);
//        dijkstra.setSource(graph.getNode(source));
//        dijkstra.compute();
//
//        // Print the lengths of the new shortest paths
////        for (Node node : tree) {
//        System.out.printf("%s->%s:%10.2f%n", dijkstra.getSource(), graph.getNode(dest),
//                dijkstra.getPathLength(graph.getNode(dest)));
////        }
//
//        // Color in blue all the nodes on the shortest path form source to dest
//        for (Node node : dijkstra.getPathNodes(graph.getNode(dest))) {
//            System.out.println((String) node.getId() + node.getAttribute("ui.style"));
////            node.addAttribute("ui.style", "marked");
//            node.addAttribute("ui.style", "fill-color: black;");
//        }
//        // Color in red all the edges in the shortest path tree
//        for (Edge edge : dijkstra.getPathEdges(graph.getNode(dest))) {
//            edge.addAttribute("ui.style", "fill-color: green;");
//        }
//        // Print all the shortest paths between source and dest
//        Iterator<Path> pathIterator = dijkstra.getAllPathsIterator(graph.getNode(dest));
//        String result = "";
//        while (pathIterator.hasNext()) {
//            result += pathIterator.next();
////            Iterator<? extends Node> iNode = pathIterator.next().getEachNode().iterator();
////            while (iNode.hasNext()) {
////                Node next = pathIterator.next().peekNode();
////                next.setAttribute("ui.class", "marked");
////                sleep();
////            }
//        }
//        Double dist = dijkstra.getPathLength(graph.getNode(dest));
//        dijkstra.clear();
//        return "Shortest Path\t: \n" + result + "\n\nDistance\t: \n" + dist + " meters";
//    }
//    
//    public String getPath(String source, String dest) {
//        createMatrix();
//        int sourceIdx = graph.getNode(source).getIndex() + 1;
//        int destIdx = graph.getNode(dest).getIndex() + 1;
////        System.out.println("index : " + sourceIdx + " & " + destIdx);
//        ArrayList<Integer> path = new ArrayList<>();
//        String result = "Shortest Path\t: \n";
//
//        DijkstraAlgorithm dijk = new DijkstraAlgorithm(graph.getNodeCount());
//        dijk.dijkstra_algorithm(matrix, sourceIdx, destIdx);
//        path = dijk.getPath();
////        for (int i = 1; i <= dijk.getDistances().length - 1; i++) {
////            System.out.println(sourceIdx + " to " + i + " is " + dijk.getDistances()[i]);
////        }
//        for (Integer i : path) {
//            result += graph.getNode(i - 1).getId() + "\n";
//            graph.getNode(i - 1).addAttribute("ui.style", "fill-color: black;");
//        }
//        for (int i = 0; i < path.size() - 1; i++) {
//            String idx1 = graph.getNode(path.get(i) - 1).getId() + "&" + graph.getNode(path.get(i + 1) - 1).
//                    getId();
//            String idx2 = graph.getNode(path.get(i + 1) - 1).getId() + "&" + graph.getNode(path.get(i) - 1).
//                    getId();
//            if (graph.getEdge(idx1) != null) {
//                graph.getEdge(idx1).addAttribute("ui.style", "fill-color: orange; size: 5px;");
//            } else if (graph.getEdge(idx2) != null) {
//                graph.getEdge(idx2).addAttribute("ui.style", "fill-color: orange; size: 5px;");
//            }
//        }
////        System.out.println(result);
//        return result;
//    }
//
//    private void createMatrix() {
//        int n = graph.getNodeCount() + 1;
//        matrix = new Double[n][n];
//        for (int i = 1; i < n; i++) {
//            for (int j = 1; j < n; j++) {
////                System.out.println(graph.getNode(i).hasEdgeBetween(j));
//                String idEdge1 = graph.getNode(i - 1).getId() + "&" + graph.getNode(j - 1).getId();
//                String idEdge2 = graph.getNode(j - 1).getId() + "&" + graph.getNode(i - 1).getId();
//                if (i == j) {
//                    matrix[i][j] = 0.0;
//                    continue;
//                } else if (graph.getEdge(idEdge1) != null) {
////                matrix[i][j] = (Double) (graph.getNode(i).hasEdgeBetween(j) ? distanceMeasure(graph.getNode(i).getAttribute("latitude"), graph.getNode(i).getAttribute("longitude"), graph.getNode(j).getAttribute("latitude"), graph.getNode(j).getAttribute("longitude")) : 0);
//                    matrix[i][j] = (Double) graph.getEdge(idEdge1).getAttribute("length");
//                } else if (graph.getEdge(idEdge2) != null) {
//                    matrix[i][j] = (Double) graph.getEdge(idEdge2).getAttribute("length");
//                } else {
//                    matrix[i][j] = 0.0;
//                }
//
//                if (matrix[i][j] == 0.0) {
//                    matrix[i][j] = 999.0;
//                }
//            }
//        }
//    } 
//    
//    
}
