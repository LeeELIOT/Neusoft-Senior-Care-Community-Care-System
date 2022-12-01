
<template>
<div>
  <el-table
    :data="tableData.slice((currentPage-1)*pageSize,currentPage*pageSize)"
    border
    style="width: 100%;margin-top: 4%;">
    <el-table-column
      prop="id"
      label="档案号"
      width="95">
    </el-table-column>
    <el-table-column
      prop="old.name"
      label="姓名"
      width="80">
    </el-table-column>
    <el-table-column
      prop="height"
      label="身高"
      width="80">
    </el-table-column>
    <el-table-column
      prop="weight"
      label="体重"
      width="80">
    </el-table-column>
    <el-table-column
      prop="blood"
      label="血型"
      width="70">
    </el-table-column>
    <el-table-column
      prop="lastDisease"
      label="既往史"
      width="200">
    </el-table-column>
    <el-table-column
      prop="nowDisease"
      label="现有病"
      width="200">
    </el-table-column>
    <el-table-column
      prop="homeDisease"
      label="家族病史"
      width="200">
    </el-table-column>
     <el-table-column
      prop="homeDisease"
      label="操作"
      width="140">
    <template slot-scope="scope">
      <el-button @click="edit(scope.row), drawer = true" type="text">查看详情</el-button>
<el-drawer
  title="我是标题"
  :visible.sync="drawer"
  :direction="direction"
  :before-close="handleClose">
  <span>我来啦!</span>
</el-drawer>
    </template>
    </el-table-column>
    <!-- <el-table-column
      prop="bloodPressure"
      label="血压">
    </el-table-column>
        <el-table-column
      prop="createBy"
      label="创建人">
    </el-table-column>
    <el-table-column
      prop="createDate"
      label="创建时间"
      width="75">
    </el-table-column>
        <el-table-column
      prop="updateBy"
      label="更新人"
      width="75">
    </el-table-column>
    <el-table-column
      prop="updateDate"
      label="更新时间"
      width="75">
    </el-table-column>
    <el-table-column
      prop="remarks"
      label="备注"
      width="75">
    </el-table-column> -->
  </el-table>
  <el-pagination align='center' 
   @size-change="handleSizeChange" 
   @current-change="handleCurrentChange"
   :current-page="currentPage" 
   :page-size="pageSize" 
   layout="total, prev, pager, next, jumper" 
   :total="tableData.length">
</el-pagination>
  </div>
  
</template>
<script>
  export default {
    methods: {
      //每页条数改变时触发 选择一页显示多少行
    handleSizeChange(val) {
         console.log(`每页 ${val} 条`);
         this.currentPage = 1;
         this.pageSize = val;
     },
     //当前页改变时触发 跳转其他页
     handleCurrentChange(val) {
         console.log(`当前页: ${val}`);
         this.currentPage = val;
     }
    },
     created(){
         const _this = this
             _this.$axios.post('http://47.93.118.35:8888/old/healthy/getAllHealthy').then(function(resp){
             _this.tableData = resp.data.pageInfo.list
             console.log(resp)
                 })
            },
    data() {
      return {
          tableData:[],
          id:'',
          old:{name:''},
          height:'',
          weight:'',
          blood:'',
          lastDisease:'',
          nowDisease:'',
          homeDisease:'',
          bloodPressure:'',
          updateTime:'',
          currentPage:1,
          total: 20, // 总条数
          pageSize: 7 // 每页的数据条数
          
      }
    }
  }
</script>
<style scoped>
</style>