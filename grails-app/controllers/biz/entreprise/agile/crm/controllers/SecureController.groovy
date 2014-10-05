package biz.entreprise.agile.crm.controllers


import biz.entreprise.agile.crm.security.*
import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.userdetails.GrailsUser

class SecureController {

    def springSecurityService
    
    def index() {
        //render 'Secure access only'
        
    }
    def test(){
           /**
        def requestmapInstance = new Requestmap(url: '/**', configAttribute: 'IS_AUTHENTICATED_ANONYMOUSLY')  
        if (!requestmapInstance.save(flush: true)) { 
            render "modify" 
            //render view: 'create', model: [requestmapInstance: requestmapInstance] 
            return 
         }
            **/
           def requestmapInstance =    Requestmap.get(23)
           
         springSecurityService.clearCachedRequestmaps()     //This is important: to refresh the requestmap. Without it the rules remain unchanged.
         //render "${message(code: 'default.created.message', args: [message(code: 'requestmap.label', default: 'Requestmap'), requestmapInstance.id])}" 
        render requestmapInstance.url 
        //redirect action: show, id: requestmapInstance.id 
                  
        
        //récupération de l'utilisateur connecté
        def GrailsUser user = springSecurityService.isLoggedIn() ? springSecurityService.loadCurrentUser() : null
        
        //def user = User.get(User.get(springSecurityService.principal.id))
        log.debug("alors : "+user)
        println(springSecurityService.isLoggedIn())
        //render "test"
        //[user:user]
    }
    
}
