<template id="banner">
<v-app id="app">
    <div class="gnb">
    <v-toolbar color="grey" style="position: relative">
        <v-app-bar-nav-icon @click.stop="drawer = true">
    </v-app-bar-nav-icon>
    <div class="col-left">
        <router-link :to="{ name: 'Home' }"
                class="nav-link"
                active-class="active">
            INDIEDOG
        </router-link>
    </div>
      <div class="col-center">
          <router-link :to="{ name: 'AllGame' }"
                  class="nav-link"
                  active-class="active">
        All Game
      </router-link>
      <router-link :to="{ name: 'GamePass' }"
                  class="nav-link"
                  active-class="active">
        Game Pass
      </router-link>
      <router-link :to="{ name: 'CloudGame' }"
                  class="nav-link"
                  active-class="active">
        Cloud Game
      </router-link>
      <router-link :to="{ name: 'TotalCommunity' }"
                  class="nav-link"
                  active-class="active">
        Community
      </router-link>
      </div>
      <v-spacer></v-spacer>
      <div class="col-right">
      <v-btn icon>
        <v-icon>mdi-translate</v-icon>
      </v-btn>

      <v-btn icon>
        <v-icon @click="list">mdi-apps</v-icon>
      </v-btn>

      <v-btn icon>
        <v-icon>mdi-account</v-icon>
      </v-btn>
      </div>
    </v-toolbar>
    

    <v-navigation-drawer
      v-model="drawer"
      absolute
      temporary
    >
      <v-list
        nav
        dense
      >
        <v-list-item-group
          v-model="group"
          active-class="grey--text text--accent-4"
        >
        <div>
          <v-list-item>
            <v-list-item-icon>
              <v-icon>mdi-home</v-icon>
            </v-list-item-icon>
            <v-list-item-title>로고</v-list-item-title>
          </v-list-item>
        </div>
        <v-spacer></v-spacer>
        <div>
          <v-list-item>
            <v-list-item-icon>
              <v-icon>mdi-account</v-icon>
            </v-list-item-icon>
            <v-list-item-title>로그인</v-list-item-title>
          </v-list-item>

          <v-list-item>
            <v-list-item-icon>
              <v-icon>mdi-home</v-icon>
            </v-list-item-icon>
            <v-list-item-title>회원가입</v-list-item-title>
          </v-list-item>

          <v-list-item>
            <v-list-item-icon>
              <v-icon>mdi-home</v-icon>
            </v-list-item-icon>
            <v-list-item-title>공지사항</v-list-item-title>
          </v-list-item>
</div>
            <div>
          <v-list-item>
            <v-list-item-icon>
              <v-icon>mdi-home</v-icon>
            </v-list-item-icon>
            <v-list-item-title>고객센터</v-list-item-title>
          </v-list-item>
          </div>
        </v-list-item-group>
      </v-list>
    </v-navigation-drawer>

    <v-footer app color="blue" class="white--text">
      <v-spacer></v-spacer>
      <span>&copy; 지붕위의 인디독</span>
    </v-footer>
    </div>
</v-app>
</template>

<script>
import router from "@/router";
    export default {
    name: 'Header',
    data (){
        return{
            drawer: false,
            group: false,


        }
    },
    components:{

    },
    
    methods: {
        home () {
      (window.location.pathname !== '/') ?
          router.push('/') : router.go(0)
          console.log("홈으로 돌암")
        },
        list (){
            (window.location.pathname !== '/totalCommunity') ?
          router.push('/totalCommunity') : router.go(0)
        }
        
    }
    }
</script>

<style scoped>
.gnb{
    display: table;
    table-layout: fixed;
    height: 60px;
    z-index: 100;
    width: 100%;

}
.nav-link{
    display: table-cell;
    text-align: center;
    color: black;
    text-decoration: none;
    padding: 10px 10px;
    margin: 10px 10px;
}
.col-left{
    display: table-cell;
    width: 10%;
    font-size: 16px;
    margin: 0 auto;
}
.col-center{
    display: table-cell;
    font-size: 14px;
    text-align: left;
    margin-left: 20px;
}
.col-right{
    display: flex;
    font-size: 10px;
    text-align: right;
    justify-content: flex-end;
}

</style>