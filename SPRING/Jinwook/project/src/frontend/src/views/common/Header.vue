<template>
<v-app>
    <v-app-bar app clipped-right color="grey" black>
        <v-app-bar-nav-icon @click="drawer = true">
        </v-app-bar-nav-icon>
        <div class="gnb-left">
            <v-btn @click="home()">Indiedog</v-btn>
        </div> 
        <div class="gnb-center">
            <v-btn @click="start('society')">All Game</v-btn>
            <v-btn @click="start('society')">Cloud Game</v-btn>
            <v-btn @click="totalCommunity()">Cloud Game</v-btn>
        </div>
        <div class="gnb-right">
        <v-btn @click="totalCommunity()" text color="white">Language</v-btn>
        <v-btn @click="home()" text color="white">Totalmenu</v-btn>
        <v-btn @click="home()" text color="white">Login</v-btn>
        </div>
        
    </v-app-bar>
    <v-navigation-drawer v-model="drawer" 
    app absolute temporary>
        <v-list dense>
            <v-list-item @click="left = !left">
                <v-list-item-action>
                    <v-icon>mdi-home</v-icon>
                </v-list-item-action>
                <v-list-item-content>
                    <v-list-item-title @click="home">로그인</v-list-item-title>
                </v-list-item-content>
            </v-list-item>
        </v-list>
        <v-list dense>
            <v-list-item @click="left = !left">
                <v-list-item-action>
                    <v-icon>mdi-Account</v-icon>
                </v-list-item-action>
                <v-list-item-content>
                    <v-list-item-title @click="home">회원가입</v-list-item-title>
                </v-list-item-content>
            </v-list-item>
        </v-list>
        <v-list dense>
            <v-list-item @click="left = !left">
                <v-list-item-action>
                    <v-icon>mdi-home</v-icon>
                </v-list-item-action>
                <v-list-item-content>
                    <v-list-item-title @click="home">공지사항</v-list-item-title>
                </v-list-item-content>
            </v-list-item>
        </v-list>
        <v-list dense>
            <v-list-item @click="left = !left">
                <v-list-item-action>
                    <v-icon>mdi-home</v-icon>
                </v-list-item-action>
                <v-list-item-content>
                    <v-list-item-title @click="home">고객센터</v-list-item-title>
                </v-list-item-content>
            </v-list-item>
        </v-list>

    </v-navigation-drawer>
</v-app>
</template>

<script>
import router from "@/router"
    export default {
        name: "header",
        data: () => ({
            drawer: true,
            left: false
        }),
    methods: {
        home() {
            (window.location.pathname !== '/') ? router.push('/') : router.go(0)
        },
        totalCommunity(){
            (window.location.pathname !== '/totalCommunity') ? router.push('/totalCommunity') : router.go(0)
            }
    }
    }
</script>

<style scoped>
.gnb-left{
    float: left;
    width: 20%;
    margin-left: 10px;
    color: saddlebrown;
}
.nav-link {
    color: #ffffff;
}
.gnb-center{
    width: 40%;
    color: black;
}
.gnb-rigth{
    float: right;
}
</style>