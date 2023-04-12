<%@ page import="kz.bitlab.techorda.models.Tasks" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>

<head>
    <%@include file="head.jsp" %>
    <title>TASK MANAGER</title>
</head>

<body>

<div class="container">
    <%@include file="navbar.jsp" %>

    <%
        Tasks task = (Tasks) request.getAttribute("task");
    %>

    <div class="row">
        <div class="col-6 mx-auto">

            <form action="/saveTask" method="post">


                <input type="hidden" name="id" value="<%=task.getId()%>">

                <div class="row">
                    <div class="col-12">
                        <label>Title :</label>
                    </div>
                </div>

                <div class="row mt-2">
                    <div class="col-12">
                        <input type="text" class="form-control" name="task_name" value="<%=task.getName()%>">
                    </div>
                </div>

                <div class="row mt-3">
                    <div class="col-12">
                        <label>Description :</label>
                    </div>
                </div>

                <div class="row mt-2">
                    <div class="col-12">
                        <textarea class="form-control" name="task_description"
                                  rows="5"><%=task.getDescription()%></textarea>
                    </div>
                </div>

                <div class="row mt-3">
                    <div class="col-12">
                        <label>Deadline :</label>
                    </div>
                </div>

                <div class="row mt-2">
                    <div class="col-12">
                        <input type="date" name="deadline" style="width: 100%;" value="<%=task.getDeadlineDate()%>">
                    </div>
                </div>

                <div class="row mt-3">
                    <div class="col-12">
                        <label>Status :</label>
                    </div>
                </div>

                <div class="row mt-2">
                    <div class="col-12">
                        <select name="status" class="form-select">
                            <option <%=(task.getStatus().equals("Done") ? "selected" : "")%>>Done</option>
                            <option <%=(task.getStatus().equals("Not completed") ? "selected" : "")%>>Not completed
                            </option>
                        </select>
                    </div>
                </div>

                <button type="submit" class="btn btn-success mt-3 " data-bs-toggle="modal" data-bs-target="#editTask">
                    Edit
                </button>
                <button type="button" class="btn btn-danger mt-3 ms-2" data-bs-toggle="modal" data-bs-target="#deleteTask">
                    Delete
                </button>


            </form>


            
            <div class="modal fade" id="deleteTask" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">

                        <form action="/deleteTask" method="post">
                            <input type="hidden" name="delete_id" value="<%=task.getId()%>">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Confirm Delete</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <h4>Are you sure to delete?</h4>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">NO</button>
                                <button class="btn btn-danger">YES</button>
                            </div>
                        </form>


                    </div>
                </div>
            </div>

        </div>


    </div>


</div>

</body>

</html>
