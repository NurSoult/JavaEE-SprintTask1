<form action="/addTask" method="post">

  <div class="row">
    <div class="col-12">
      <label>Title :</label>
    </div>
  </div>

  <div class="row mt-2">
    <div class="col-12">
      <input type="text" class="form-control" name="task_name" placeholder="Title...">
    </div>
  </div>

  <div class="row mt-3">
    <div class="col-12">
      <label>Description :</label>
    </div>
  </div>

  <div class="row mt-2">
    <div class="col-12">
      <textarea class="form-control" name="task_description" placeholder="Description..." rows="5"></textarea>
    </div>
  </div>

  <div class="row mt-3">
    <div class="col-12">
      <label>Deadline :</label>
    </div>
  </div>

  <div class="row mt-2">
    <div class="col-12">
      <input type="date" name="deadline" style="width: 100%;">
    </div>
  </div>

  <div class="modal-footer">
    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
    <button type="submit" class="btn btn-primary">Add</button>
  </div>

</form>