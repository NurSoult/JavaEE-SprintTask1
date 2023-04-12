<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.techorda.models.Tasks" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>

  <head>
      <%@include file="head.jsp"%>
      <title>TASK MANAGER</title>
  </head>


  <body>
      <div class="container">
          <%@include file="navbar.jsp" %>

          <div>

              <button type="button" class="btn btn-primary" style="background-color: darkblue;" data-bs-toggle="modal" data-bs-target="#addTask">
                  + Добавить задание
              </button>


              <div class="modal fade" id="addTask" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                  <div class="modal-dialog modal-lg">
                      <div class="modal-content">
                          <div class="modal-header">
                              <h1 class="modal-title fs-5" id="staticBackdropLabel">Новое задание</h1>
                              <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                          </div>
                          <div class="modal-body">
                              <%@include file="addForm.jsp"%>
                          </div>

                      </div>
                  </div>
              </div>
          </div>


        <table class="table" style="margin-top: 10px;">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Title</th>
                    <th scope="col">Deadline</th>
                    <th scope="col">Status</th>
                    <th scope="col" style="width: 10%;">Details</th>
                </tr>
            </thead>

            <tbody>

                <%
                    ArrayList<Tasks> tasks = (ArrayList<Tasks>) request.getAttribute("tasks");
                    for (Tasks t: tasks) {
                %>

                <tr>
                    <td><%=t.getId()%></td>
                    <td><%=t.getName()%></td>
                    <td><%=t.getDeadlineDate()%></td>
                    <td><%=t.getStatus()%></td>
                    <td><button type="button" class="btn btn-primary btn-sm" style="background-color: darkblue;"><a role="button" style="text-decoration: none; color: white;" class="btn-primary" href="/details?id=<%=t.getId()%>">Details</a></button></td>
                </tr>

                <%
                    }
                %>

            </tbody>

        </table>


      </div>




  </body>

</html>
