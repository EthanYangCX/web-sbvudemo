<template>
  <div style="padding: 10px">
<!--    Function Area-->
    <div style="margin: 10px 0">
      <el-button type="primary" @click="handleAdd">Add</el-button>
      <el-button type="primary">Import</el-button>
      <el-button type="primary">Export</el-button>
    </div>

<!--    Search Area-->
    <div style="margin: 10px 0">
      <el-input v-model="search" placeholder="Please input" style="width: 20%"/>
      <el-button type="primary" style="margin-left: 5px">Search</el-button>
    </div>

    <el-table :data="tableData" stripe border style="width: 100%">
      <el-table-column prop="id" label="ID" sortable/>
      <el-table-column prop="username" label="Username"/>
      <el-table-column prop="nickName" label="Nick Name" />
      <el-table-column prop="age" label="Age" />
      <el-table-column prop="sex" label="Sex" />
      <el-table-column prop="address" label="Address" />
      <el-table-column label="Operations">
        <template #default>
          <el-button size="mini" @click="handleEdit">Edit</el-button>
          <el-popconfirm title="Are you sure to delete this?">
            <template #reference>
              <el-button size="mini" type="danger" @click="handleDelete">Delete</el-button>
            </template>
          </el-popconfirm>
        </template>
      </el-table-column>
    </el-table>

    <div style="margin: 10px 0">
      <el-pagination
          v-model:currentPage="currentPage"
          :page-sizes="[5, 10, 20]"
          :page-size="10"
          layout="total, sizes, prev, pager, next, jumper"
          :total="total"
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
      >
      </el-pagination>

      <el-dialog v-model="dialogVisible" title="Tips" width="30%">
        <el-form :model="form" label-width="120px">
          <el-form-item label="Username">
            <el-input v-model="form.username" style="width: 80%"></el-input>
          </el-form-item>
          <el-form-item label="Nick Name">
            <el-input v-model="form.nickName" style="width: 80%"></el-input>
          </el-form-item>
          <el-form-item label="Age">
            <el-input v-model="form.age" style="width: 80%"></el-input>
          </el-form-item>
          <el-form-item label="Sex">
            <el-radio v-model="form.sex" label="Male">Male</el-radio>
            <el-radio v-model="form.sex" label="Female">Female</el-radio>
            <el-radio v-model="form.sex" label="Unknown">Unknown</el-radio>
          </el-form-item>
          <el-form-item label="Address">
            <el-input v-model="form.address" style="width: 80%" type="textarea"></el-input>
          </el-form-item>
        </el-form>
        <template #footer>
          <span class="dialog-footer">
            <el-button @click="dialogVisible = false">Cancel</el-button>
            <el-button type="primary" @click="save"
            >Confirm</el-button
            >
          </span>
        </template>
      </el-dialog>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src

export default {
  name: 'Home',
  components: {
  },
  data() {
    return {
      form: {},
      dialogVisible: false,
      search: '',
      currentPage: 1,
      total: 10,
      tableData: [

      ],
    }
  },
  methods: {
    handleAdd() {
      this.dialogVisible = true
      this.form = {}
    },
    save() {

    },
    handleEdit() {

    },
    handleDelete() {

    },
    handleSizeChange() {

    },
    handleCurrentChange() {

    }
  }
}
</script>
