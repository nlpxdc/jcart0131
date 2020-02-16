var app = new Vue({
    el: '#app',
    data: {
        username: '',
        realName: '',
        email: '',
        password: ''
    },
    mounted() {
        console.log('view mounted');
        this.getAdministratorProfile();
    },
    methods: {
        handleUpdateClick() {
            console.log('update click');
            this.updateAdministratorProfile();
        },
        getAdministratorProfile() {
            axios.get('/administrator/getProfile')
                .then(function (response) {
                    console.log(response);
                    var me = response.data;
                    app.username = me.username;
                    app.realName = me.realName;
                    app.email = me.email;
                })
                .catch(function (error) {
                    console.error(error);
                });
        },
        updateAdministratorProfile() {
            axios.post('/administrator/updateProfile', {
                realName: this.realName,
                email: this.email,
                password: this.password
            })
                .then(function (response) {
                    console.log(response);
                    alert('更新成功');
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    }

})