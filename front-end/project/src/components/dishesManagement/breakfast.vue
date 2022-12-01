<template>
<div>
    <el-row :gutter="20"  class="el-row" type="flex">
    <el-col :span="5" v-for = "(item,index) in dishes" :key="item.id" class="el-col" >
      <el-card :body-style="{ padding: '0px' }" class="el-card"  :key="index"  onclick="">
          <img :src=item.picture style="height:200px;" class="image">
        <div >
          <div class="text item">
            <div slot="header" class="clearfix" style="font-size:20px;margin-left: 2%;color:black;">
          <span>{{item.name}}</span>
        </div>
          </div>
          <div class="text item">
            <div class="item_tag">
              <span>口味：</span>
            </div>
            <div class="item_desr">
              {{item.taste.name}}
            </div>
          </div>
          <div class="text item">
            <div class="item_tag">
              <span>价格：</span>
            </div>
            <div class="item_desr">
              <span>
                 {{item.price}}
              </span>
            </div>
          </div>
        </div>
      </el-card>
    </el-col>
  </el-row>
</div>
</template>

<script>
  export default {
      created(){
        const _this = this
             _this.$axios.post('http://47.93.118.35:8888/old//food/getAllFoods?name=早餐').then(function(resp){
             _this.dishes = resp.data.allFoods
             console.log(resp.data.allFoods)
                 })               
        },
            
    methods: {
      
    },
    data() {
      return {
        dishes:[ ],
        id:'',
        name:'',
        picture:'',
        price:'',
        json:{
          taste:{},
        }
      }
    }
  }
</script>
<style type="text/css" scoped>
.all{
    margin-top: -30px;
    word-break: break-all;
    height: 100%;
  }
  .mid{
    margin-top: 25%;
    height: 50%;
  }
  .mid_item{
    justify-content: center;
    align-items: center;
  }
  .item {
    margin-bottom: 10px;
  }
  .item_tag{
    float:left;
    text-align:left;
    margin-left: 2%
  }
  .item_desr{
    margin-left: 20%;
    min-height: 15px;
    text-align:left;
  }
  .text {
    width: 100%;
    font-size: 10px;
    font-family: "Microsoft YaHei";
    color: #909399;
  }
  .clearfix:before,
  .clearfix:after {
      display: table;
      content: "";
  }
  
  .clearfix:after {
      clear: both
  }
 
  .el-card {
    height: 100%;
    margin-right: 10px;
    /*transition: all .5s;*/
  }
  .el-card:hover{
    margin-top: -5px;
  }
  .el-row {
    margin-top: 10px;
    display: flex;
    flex-wrap: wrap
  }
  .el-col {
    border-radius: 4px;
    align-items: stretch;
    margin-bottom: 20px;
  }
   .image {
    width: 100%;
    display: block;
  }
</style>