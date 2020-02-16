var app = new Vue({
    el: '#app',
    data: {
        administratorId: '',
        username: '',
        realName: '',
        email: '',
        password: '',
        statuses: [
            {
                value: 0,
                label: '禁用'
            }, {
                value: 1,
                label: '启用'
            }
        ],
        selectedStatus: ''
    },
    mounted() {
        console.log('view mounted');

        var url = new URL(location.href);
        this.administratorId = url.searchParams.get("administratorId");
        if (!this.administratorId) {
            alert('administratorId is null');
            return;
        }

        this.getAdministrator();

    },
    methods: {
        handleUpdateClick() {
            console.log('update click');
            this.updateAdministrator();
        },
        getAdministrator() {
            axios.get('/administrator/getById', {
                params: {
                    administratorId: this.administratorId
                }
            })
                .then(function (response) {
                    console.log(response);
                    var administrator = response.data;
                    app.administratorId = administrator.administratorId;
                    app.username = administrator.username;
                    app.realName = administrator.realName;
                    app.email = administrator.email;
                    app.selectedStatus = administrator.status;
                })
                .catch(function (error) {
                    console.error(error);
                });
        },
        updateAdministrator() {
            axios.post('/administrator/update', {
                administratorId: this.administratorId,
                realName: this.realName,
                email: this.email,
                password: this.password,
                status: this.selectedStatus
            })
                .then(function (response) {
                    console.log(response);
                    alert('修改成功');
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    }
})